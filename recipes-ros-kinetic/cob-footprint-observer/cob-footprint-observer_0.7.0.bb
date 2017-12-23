# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The cob_footprint_observer package adjusts the footprint of the robot based on t"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "boost catkin-native geometry-msgs message-generation message-runtime roscpp std-msgs tf"
SRC_URI = "https://github.com/ipa320/cob_control-release/archive/release/kinetic/cob_footprint_observer/0.7.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1ca677d26ebcf6d68df1e65d1e53fa7c"
SRC_URI[sha256sum] = "a484e7f40e1bb668d710e0b63f833aa75981fd2f070eaf122bf348e682c0cd90"
S = "${WORKDIR}/cob_control-release-release-kinetic-cob_footprint_observer-0.7.0-0"

inherit catkin
