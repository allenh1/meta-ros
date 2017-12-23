# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "hector_pose_estimation_core is the core package of the hector_localization stack"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cmake-modules eigen geographic-msgs geometry-msgs nav-msgs rosconsole roscpp rostime sensor-msgs tf"
SRC_URI = "https://github.com/tu-darmstadt-ros-pkg-gbp/hector_localization-release/archive/release/kinetic/hector_pose_estimation_core/0.3.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c9c004f55f4423984d4823fcf378d6c2"
SRC_URI[sha256sum] = "916a0df99a333a3c698e8c718fa05fcebe38a882e6cc7b0353781e806bdc04e3"
S = "${WORKDIR}/hector_localization-release-release-kinetic-hector_pose_estimation_core-0.3.0-0"

inherit catkin
