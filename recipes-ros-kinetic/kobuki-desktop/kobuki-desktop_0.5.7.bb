# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Visualisation and simulation tools for Kobuki"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native kobuki-dashboard kobuki-gazebo kobuki-gazebo-plugins kobuki-qtestsuite kobuki-rviz-launchers"
SRC_URI = "https://github.com/yujinrobot-release/kobuki_desktop-release/archive/release/kinetic/kobuki_desktop/0.5.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "492d2751eb304e2b70d92fcf1be7e0a1"
SRC_URI[sha256sum] = "9c146882399b24a957c9c123648a3a12fdc90009de7ceff55ee2ecc3745ad641"
S = "${WORKDIR}/kobuki_desktop-release-release-kinetic-kobuki_desktop-0.5.7-0"

inherit catkin
