# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Kobuki test suite: this package provides tools to thoroughly test Kobuki's hardw"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs kobuki-msgs kobuki-node message-generation message-runtime python-orocos-kdl sensor-msgs std-msgs"
SRC_URI = "https://github.com/yujinrobot-release/kobuki-release/archive/release/kinetic/kobuki_testsuite/0.7.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7334927ad55f14cbab148ca50c9b5d43"
SRC_URI[sha256sum] = "fd160f60c2b8f1565351f8e66f6b4bbe0c373ba7e2bf471338785de3625c6f70"
S = "${WORKDIR}/kobuki-release-release-kinetic-kobuki_testsuite-0.7.4-0"

inherit catkin
