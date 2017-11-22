# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Configuration package for Pyros"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin catkin-pip python-pytest python-six"
SRC_URI = "https://github.com/pyros-dev/pyros-config-rosrelease/archive/release/lunar/pyros_config/0.2.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "caa44032955ce5ab095315fd905f753e"
SRC_URI[sha256sum] = "bdb89f2a01540233242469bc1c4620a5f2037899cbeeaf78a79fcc703e5c5bf4"
S = "${WORKDIR}/pyros-config-rosrelease-release-lunar-pyros_config-0.2.0-0"

inherit catkin
