# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Defines the messages that are used to communicate with the     p2os_driver packa"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/allenh1/p2os-release/archive/release/kinetic/p2os_msgs/2.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "91bfe457f80fea2d06549933232fb79e"
SRC_URI[sha256sum] = "581343da8fbc696ecdb595b12fbbd7a967940c22f945c2ad491bb79b0f2fec59"
S = "${WORKDIR}/p2os-release-release-kinetic-p2os_msgs-2.1.0-0"

inherit catkin
