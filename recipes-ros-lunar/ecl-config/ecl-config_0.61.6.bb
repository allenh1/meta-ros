# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "These tools inspect and describe your system with macros, types       and functi"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin ecl-build ecl-license"
SRC_URI = "https://github.com/yujinrobot-release/ecl_lite-release/archive/release/lunar/ecl_config/0.61.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "43abb86a3eaa38efbe7db9db29af311b"
SRC_URI[sha256sum] = "b4a68d354a32b3b5a822516c8c5a0b45b79340c1e9581de101a626197ea1b224"
S = "${WORKDIR}/ecl_lite-release-release-lunar-ecl_config-0.61.6-0"

inherit catkin
