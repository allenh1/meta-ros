# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A controller ensuring the safe operation of Kobuki.      The SafetyController ke"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native ecl-threads geometry-msgs kobuki-msgs nodelet pluginlib roscpp std-msgs yocs-controllers"
SRC_URI = "https://github.com/yujinrobot-release/kobuki-release/archive/release/kinetic/kobuki_safety_controller/0.7.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a26b673c92999bafdf94c0f59029a93d"
SRC_URI[sha256sum] = "ee224dec7bc5a7107476f2af78800f5ee7a75adecc0d499c3cf1bd56ae1c7e42"
S = "${WORKDIR}/kobuki-release-release-kinetic-kobuki_safety_controller-0.7.4-0"

inherit catkin
