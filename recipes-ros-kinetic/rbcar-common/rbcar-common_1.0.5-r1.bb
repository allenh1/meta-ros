# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The rbcar_common package. It contains RBCAR common packages"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native rbcar-description rbcar-pad"
SRC_URI = "https://github.com/RobotnikAutomation/rbcar_common-release/archive/release/kinetic/rbcar_common/1.0.5-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3334b6e1076a3f8e75fa40e6767b02f8"
SRC_URI[sha256sum] = "b4b1ac70711b45e9dbe45942ec245578d80e9ca7884165a99250ffa5e26b80d4"
S = "${WORKDIR}/rbcar_common-release-release-kinetic-rbcar_common-1.0.5-1"

inherit catkin
