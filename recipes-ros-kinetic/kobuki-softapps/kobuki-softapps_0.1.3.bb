# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The kobuki_softapps package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native fake-localization kobuki-softnode map-server move-base rviz"
SRC_URI = "https://github.com/yujinrobot-release/kobuki_soft-release/archive/release/kinetic/kobuki_softapps/0.1.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f172751be47713ea91374b557095b39d"
SRC_URI[sha256sum] = "87ae1a4474462014e28d9cb23d240d4bb25f686c8658ae7a15ff5e98f44cc3ca"
S = "${WORKDIR}/kobuki_soft-release-release-kinetic-kobuki_softapps-0.1.3-0"

inherit catkin
