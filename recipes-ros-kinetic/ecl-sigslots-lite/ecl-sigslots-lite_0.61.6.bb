# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This avoids use of dynamic storage (malloc/new) and thread safety (mutexes) to  "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native ecl-config ecl-errors ecl-license"
SRC_URI = "https://github.com/yujinrobot-release/ecl_lite-release/archive/release/kinetic/ecl_sigslots_lite/0.61.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "83587ac0adeac26dcd3903d9bce131e0"
SRC_URI[sha256sum] = "43689fffafa1432d96c708ba99e1f71268a153f74ce93f2f4f98f384852d4e27"
S = "${WORKDIR}/ecl_lite-release-release-kinetic-ecl_sigslots_lite-0.61.6-0"

inherit catkin
