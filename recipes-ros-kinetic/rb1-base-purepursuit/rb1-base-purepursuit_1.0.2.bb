# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The rb1_base_purepursuit package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native"
SRC_URI = "https://github.com/RobotnikAutomation/rb1_base_sim-release/archive/release/kinetic/rb1_base_purepursuit/1.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "57c231fd884fe54773629bc4905afa17"
SRC_URI[sha256sum] = "2761f291d10a3f4b441997677d2950fe42085e736784d9498d6662a9407a945b"
S = "${WORKDIR}/rb1_base_sim-release-release-kinetic-rb1_base_purepursuit-1.0.2-0"

inherit catkin
