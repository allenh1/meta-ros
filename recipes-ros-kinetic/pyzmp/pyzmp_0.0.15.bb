# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Python Multiprocess Management Framework, based on ZeroMQ communication"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin-pip python-zmq"
SRC_URI = "https://github.com/asmodehn/${PN}-rosrelease/archive/release/kinetic/${PN}/0.0.15-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4b295b4e8935bdd2df8c0aaac8826b39"
SRC_URI[sha256sum] = "0c29adc9ad77005037ac0e61e1c66b7098f53f378c5114ca25fd1eea19de86e8"
S = "${WORKDIR}/${PN}-rosrelease-release-kinetic-${PN}-0.0.15-0"

inherit catkin
