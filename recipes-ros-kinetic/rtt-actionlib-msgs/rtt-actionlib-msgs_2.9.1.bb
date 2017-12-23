# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provides an rtt typekit for ROS actionlib_msgs messages.      It allows you to u"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=21;endline=21;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib-msgs catkin-native rtt-roscomm rtt-std-msgs"
SRC_URI = "https://github.com/orocos-gbp/rtt_ros_integration-release/archive/release/kinetic/rtt_actionlib_msgs/2.9.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c6259c2baa88b0f5a0d8eed46322b9e6"
SRC_URI[sha256sum] = "0a5c9eeca6677a6d77f762133a83ab145a4c972dffa2742d92174ec70229a350"
S = "${WORKDIR}/rtt_ros_integration-release-release-kinetic-rtt_actionlib_msgs-2.9.1-0"

inherit catkin
