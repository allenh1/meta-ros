# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Launch and configuration files for calibrating hironx using the generic  package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "calibration-estimation calibration-launch catkin-native kdl-parser openni2-launch orocos-kdl"
SRC_URI = "https://github.com/tork-a/rtmros_hironx-release/archive/release/kinetic/hironx_calibration/2.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b2c4daafcbc2dd015080afa449fd061d"
SRC_URI[sha256sum] = "9b6d5e1eeef4fb5573258e6f9d90eaa8cb16894c229ff8768c57353193539af9"
S = "${WORKDIR}/rtmros_hironx-release-release-kinetic-hironx_calibration-2.1.0-0"

inherit catkin
