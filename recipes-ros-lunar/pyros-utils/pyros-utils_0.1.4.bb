# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Miscellaneous tools for pyROS"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin catkin-pip rosgraph roslaunch roslint rospy rostest"
SRC_URI = "https://github.com/pyros-dev/pyros-utils-release/archive/release/lunar/pyros_utils/0.1.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0f2a92610aa8ad652d392db41abbb02f"
SRC_URI[sha256sum] = "ca63a6f1acdddc3b64b1741839302b91f6ff30ba57d4bea50abd941e432a00fc"
S = "${WORKDIR}/pyros-utils-release-release-lunar-pyros_utils-0.1.4-0"

inherit catkin
