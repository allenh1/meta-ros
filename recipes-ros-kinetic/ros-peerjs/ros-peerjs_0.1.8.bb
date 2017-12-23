# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS Peerjs package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=2c00b8d2854109dbebef7818b4dae1e2"

DEPENDS = "catkin-native git gtk2 libasound2-dev libgconf2 libnss3-dev libxss1 libxtst-dev nodejs nodejs-legacy npm xvfb"
SRC_URI = "https://github.com/easymov/ros_peerjs-release/archive/release/kinetic/ros_peerjs/0.1.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7c8a6361ea1d470e6b308c358a217c71"
SRC_URI[sha256sum] = "a6c846552618e2a8d7a7f2ceb524d29ab9fbf1749bac9fead0b37b8cf3287f00"
S = "${WORKDIR}/ros_peerjs-release-release-kinetic-ros_peerjs-0.1.8-0"

inherit catkin
