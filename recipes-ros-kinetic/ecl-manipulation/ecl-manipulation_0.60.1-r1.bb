# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Includes basic manipulation related structures as well as a few      algorithms "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native ecl-manipulators"
SRC_URI = "https://github.com/yujinrobot-release/ecl_manipulation-release/archive/release/kinetic/ecl_manipulation/0.60.1-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5c32cea40b00bd1d878db49d4804e99b"
SRC_URI[sha256sum] = "41d8f4bce69dacff16673e4c34452330699bef537114681203ab5b74622a84f3"
S = "${WORKDIR}/ecl_manipulation-release-release-kinetic-ecl_manipulation-0.60.1-1"

inherit catkin
