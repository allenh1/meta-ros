# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provides an rtt typekit for ROS trajectory_msgs messages.      It allows you to "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=21;endline=21;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native rtt-geometry-msgs rtt-roscomm rtt-std-msgs trajectory-msgs"
SRC_URI = "https://github.com/orocos-gbp/rtt_ros_integration-release/archive/release/kinetic/rtt_trajectory_msgs/2.9.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3a23db777605f8cf511f74a2e2fbdc4c"
SRC_URI[sha256sum] = "ffb2bf8a025f5688920724ae0eccc3b239aaf2812d8d3149b9da2c4bed53a83b"
S = "${WORKDIR}/rtt_ros_integration-release-release-kinetic-rtt_trajectory_msgs-2.9.1-0"

inherit catkin
