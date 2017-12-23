# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provides an rtt typekit for ROS diagnostic_msgs messages.      It allows you to "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=21;endline=21;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native diagnostic-msgs rtt-roscomm rtt-std-msgs"
SRC_URI = "https://github.com/orocos-gbp/rtt_ros_integration-release/archive/release/kinetic/rtt_diagnostic_msgs/2.9.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "407219d3ea6d2da3d707bc3595361a07"
SRC_URI[sha256sum] = "75813e883761632edea52ccddb5c6da21232acfaf162b87c1ceee9493c860c17"
S = "${WORKDIR}/rtt_ros_integration-release-release-kinetic-rtt_diagnostic_msgs-2.9.1-0"

inherit catkin
