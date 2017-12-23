# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Configuration package for Pyros"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin-pip python-pytest python-six"
SRC_URI = "https://github.com/asmodehn/${PN}-rosrelease/archive/release/kinetic/pyros_config/0.2.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a996e5a1e1b25ab9a5a15297ba8669c8"
SRC_URI[sha256sum] = "a5194a03ee2bbe0dd7688ad15d6b3609a194c00b28e8a0f4b9c6108f251e7759"
S = "${WORKDIR}/${PN}-rosrelease-release-kinetic-pyros_config-0.2.0-0"

inherit catkin
