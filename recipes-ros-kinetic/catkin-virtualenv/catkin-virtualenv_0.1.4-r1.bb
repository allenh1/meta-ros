# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Bundle a virtualenv with a catkin package."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL-1"
LIC_FILES_CHKSUM = "file://package.xml;beginline=21;endline=21;md5=d6fd5bd8a2ca0ce00c65331b4263470b"

DEPENDS = "catkin-native python-enum34 python-virtualenv python3-dev"
SRC_URI = "https://github.com/locusrobotics/catkin_virtualenv-release/archive/release/kinetic/catkin_virtualenv/0.1.4-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2bca78db1ef04d2227b629a8205792b8"
SRC_URI[sha256sum] = "4ec5c22b2ceb6e71050f13cba705be775f76d3e100dd4325893e6267d5dbb84b"
S = "${WORKDIR}/catkin_virtualenv-release-release-kinetic-catkin_virtualenv-0.1.4-1"

inherit catkin
