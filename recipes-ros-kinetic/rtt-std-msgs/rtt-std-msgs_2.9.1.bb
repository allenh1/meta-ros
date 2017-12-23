# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provides an rtt typekit for ROS std_msgs messages.      It allows you to use ROS"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=21;endline=21;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native rtt-ros rtt-roscomm std-msgs"
SRC_URI = "https://github.com/orocos-gbp/rtt_ros_integration-release/archive/release/kinetic/rtt_std_msgs/2.9.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9056957ec5ec7809076e13cb17da39f0"
SRC_URI[sha256sum] = "153103599d56264a493bb8b986baf15fee2274806851d8f3605132b39572ae61"
S = "${WORKDIR}/rtt_ros_integration-release-release-kinetic-rtt_std_msgs-2.9.1-0"

inherit catkin
