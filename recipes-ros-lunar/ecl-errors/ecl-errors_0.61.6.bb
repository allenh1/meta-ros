# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This library provides lean and mean error mechanisms.      It includes c style e"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin ecl-config ecl-license"
SRC_URI = "https://github.com/yujinrobot-release/ecl_lite-release/archive/release/lunar/ecl_errors/0.61.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b08cf3cad4b338a56e368b68e352b8ae"
SRC_URI[sha256sum] = "9d44d8d9c8a95c217af8cf433645853ffcae81cf8a1e93a89614668ca55aed42"
S = "${WORKDIR}/ecl_lite-release-release-lunar-ecl_errors-0.61.6-0"

inherit catkin
