# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "URDF description of the Summit XL and Summit XL HL, platform messages and other "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native summit-xl-description summit-xl-localization summit-xl-navigation summit-xl-pad"
SRC_URI = "https://github.com/RobotnikAutomation/summit_xl_common-release/archive/release/kinetic/summit_xl_common/1.1.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "809bc0cf492646fca3fd4082d1af0efd"
SRC_URI[sha256sum] = "bc9c7652afaddd17c7238d53bb2730cb8dc146d0ea7371079e69b382632ec5b9"
S = "${WORKDIR}/summit_xl_common-release-release-kinetic-summit_xl_common-1.1.2-0"

inherit catkin
