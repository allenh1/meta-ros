# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The cob_simulation stack includes packages to work with Care-O-bot within simula"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native cob-bringup-sim cob-gazebo cob-gazebo-objects cob-gazebo-worlds"
SRC_URI = "https://github.com/ipa320/cob_simulation-release/archive/release/kinetic/cob_simulation/0.6.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2047b57e8b68c0dbc513a800c1402a24"
SRC_URI[sha256sum] = "98b6843cae6fabdde14c86fd4a3980e6f176b775bdd66067b6769d986ab2f2e5"
S = "${WORKDIR}/cob_simulation-release-release-kinetic-cob_simulation-0.6.8-0"

inherit catkin
