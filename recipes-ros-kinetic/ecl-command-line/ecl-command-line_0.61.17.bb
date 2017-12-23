# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Embeds the TCLAP library inside the ecl. This is a very convenient      command "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native ecl-license"
SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/kinetic/ecl_command_line/0.61.17-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "87109f2e16cd0a9149f6400d8f430bfd"
SRC_URI[sha256sum] = "8e4ad3a4d858473e87d02d2fb7cb59695617526e52b41c951b2e625af7dbafc4"
S = "${WORKDIR}/ecl_core-release-release-kinetic-ecl_command_line-0.61.17-0"

inherit catkin
