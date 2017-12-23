# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Software for Kobuki, Yujin Robot's mobile research base."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native kobuki-auto-docking kobuki-bumper2pc kobuki-capabilities kobuki-controller-tutorial kobuki-description kobuki-keyop kobuki-node kobuki-random-walker kobuki-rapps kobuki-safety-controller kobuki-testsuite"
SRC_URI = "https://github.com/yujinrobot-release/${PN}-release/archive/release/kinetic/${PN}/0.7.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b1a1602ec977ccfa8e5eccab8ccf1531"
SRC_URI[sha256sum] = "5d68e3a41722edd63a27686bce4c97957d03cc65cfd92296f04b521bc692a049"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-0.7.4-0"

inherit catkin
