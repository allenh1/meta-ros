# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Bundle a virtualenv with a catkin package."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL-1"
LIC_FILES_CHKSUM = "file://package.xml;beginline=21;endline=21;md5=d6fd5bd8a2ca0ce00c65331b4263470b"

DEPENDS = "catkin-native python-enum34 python-virtualenv python3-dev"
SRC_URI = "https://github.com/locusrobotics/catkin_virtualenv-release/archive/release/lunar/catkin_virtualenv/0.1.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "23e6690cccbc6d3b4776c7f97a06ed85"
SRC_URI[sha256sum] = "21591d00c0bdb0a375b990c829d1d65e540b7061bcddf89a8f0daf29ac7f7991"
S = "${WORKDIR}/catkin_virtualenv-release-release-lunar-catkin_virtualenv-0.1.4-0"

inherit catkin
