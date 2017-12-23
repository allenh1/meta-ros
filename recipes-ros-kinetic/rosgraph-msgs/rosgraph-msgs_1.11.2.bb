# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Messages relating to the ROS Computation Graph. These are generally considered t"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/ros-gbp/ros_comm_msgs-release/archive/release/kinetic/rosgraph_msgs/1.11.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9740097e6154d06f20f47226eb72d006"
SRC_URI[sha256sum] = "c2f1c73750c45998279607f10a57c4bb75839e1872fbbc831acd7ea06c49aa9f"
S = "${WORKDIR}/ros_comm_msgs-release-release-kinetic-rosgraph_msgs-1.11.2-0"

inherit catkin
