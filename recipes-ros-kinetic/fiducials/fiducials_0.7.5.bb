# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Localization using fiducial markers"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "aruco-detect catkin-native fiducial-detect fiducial-lib fiducial-msgs fiducial-pose fiducial-slam"
SRC_URI = "https://github.com/UbiquityRobotics-release/${PN}-release/archive/release/kinetic/${PN}/0.7.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0bd5985815913fd3d5dbc0ea8df6871f"
SRC_URI[sha256sum] = "9b9b453612cb4444d0a68e666f735e35cf5f124d34509ee6b4ab929052ed68f7"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-0.7.5-0"

inherit catkin
