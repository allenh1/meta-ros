# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Locally patched version of the python redis client (https://github.com/andymccur"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native python-catkin-pkg-native"
SRC_URI = "https://github.com/yujinrobot-release/rocon_tools-release/archive/release/kinetic/rocon_python_redis/0.3.2-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "67542eb815634ce614b0b80e14800778"
SRC_URI[sha256sum] = "e5c54406e2e37a79b3c01ff7d897109114b846d9d2f9f0e761f5e43c637d7c25"
S = "${WORKDIR}/rocon_tools-release-release-kinetic-rocon_python_redis-0.3.2-1"

inherit catkin
