# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Oros Tools is software suite that provide high     level functions to the web pl"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=2c00b8d2854109dbebef7818b4dae1e2"

DEPENDS = "catkin-native log-server ros-peerjs rosbridge-suite"
SRC_URI = "https://github.com/easymov/oros_tools-release/archive/release/kinetic/oros_tools/0.1.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "495bad4a9f8a89e4c8916ff5a47f1598"
SRC_URI[sha256sum] = "aaa2f2bdab754a4324621495f57c36e372b24bebbe1566d65057f3e89ac0d540"
S = "${WORKDIR}/oros_tools-release-release-kinetic-oros_tools-0.1.1-0"

inherit catkin
