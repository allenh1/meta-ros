# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Common service definitions."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-generation message-runtime"
SRC_URI = "https://github.com/ros-gbp/ros_comm_msgs-release/archive/release/kinetic/std_srvs/1.11.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "803e1a755412bf261aac3e57aec429aa"
SRC_URI[sha256sum] = "223955e2e05e6d86f5c1f57d00c55e4a2f6ac3f9060f727ee512b2602c253184"
S = "${WORKDIR}/ros_comm_msgs-release-release-kinetic-std_srvs-1.11.2-0"

inherit catkin
