# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This avoids use of dynamic storage (malloc/new) and thread safety (mutexes) to  "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin ecl-config ecl-errors ecl-license"
SRC_URI = "https://github.com/yujinrobot-release/ecl_lite-release/archive/release/lunar/ecl_sigslots_lite/0.61.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9d7e4d74919a2f88cf23682c94d32a78"
SRC_URI[sha256sum] = "da287df89c544e6121ff760e76a72eef1d7ece79051a2d35ee1a0722d5ea6e0d"
S = "${WORKDIR}/ecl_lite-release-release-lunar-ecl_sigslots_lite-0.61.6-0"

inherit catkin
