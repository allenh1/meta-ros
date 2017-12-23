# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "These tools inspect and describe your system with macros, types       and functi"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native ecl-build ecl-license"
SRC_URI = "https://github.com/yujinrobot-release/ecl_lite-release/archive/release/kinetic/ecl_config/0.61.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8e789ad46e1f27be403daee22f42f9ea"
SRC_URI[sha256sum] = "9d9fb8c17748ec4f89cb8d577c173fa622f168e0d64050b6f1dd2c486de4f2ed"
S = "${WORKDIR}/ecl_lite-release-release-kinetic-ecl_config-0.61.6-0"

inherit catkin
