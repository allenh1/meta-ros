# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS tools for those who live in Emacs."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native emacs"
SRC_URI = "https://github.com/code-iai-release/ros_emacs_utils-release/archive/release/kinetic/${PN}/0.4.11-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "10b90d51ae47ac70ac046002483e2b2f"
SRC_URI[sha256sum] = "929d76db6904e5247357bae136a4fd19ab846881a5a214dab691607f32c38afc"
S = "${WORKDIR}/ros_emacs_utils-release-release-kinetic-${PN}-0.4.11-0"

inherit catkin
