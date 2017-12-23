# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package is a substitute for the private implementation of cob_safety_contro"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native"
SRC_URI = "https://github.com/ipa320/cob_substitute-release/archive/release/kinetic/cob_safety_controller/0.6.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f3cd9bdc1687018dba20a34364d1f7d9"
SRC_URI[sha256sum] = "91757ea25753c2725996128e6cefbcc6e753112991988e2cb26e442b6c626fe4"
S = "${WORKDIR}/cob_substitute-release-release-kinetic-cob_safety_controller-0.6.6-0"

inherit catkin
