# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provides a toolchain running through the robot calibration process. This      in"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "calibration-estimation calibration-launch calibration-msgs catkin-native image-cb-detector interval-intersection joint-states-settler laser-cb-detector monocam-settler settlerlib"
SRC_URI = "https://github.com/ros-gbp/${PN}-release/archive/release/kinetic/${PN}/0.10.14-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "777e0ef968a8a588544810840f98a7f4"
SRC_URI[sha256sum] = "c4ae4faade4daaa2c3dae28fea9c2c807547221830fd8d023122dd484fa5df31"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-0.10.14-0"

inherit catkin
