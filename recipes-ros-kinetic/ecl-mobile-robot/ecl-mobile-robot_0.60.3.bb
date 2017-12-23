# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Contains transforms (e.g. differential drive inverse kinematics)     for the var"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native ecl-build ecl-errors ecl-formatters ecl-geometry ecl-license ecl-linear-algebra ecl-math"
SRC_URI = "https://github.com/yujinrobot-release/ecl_navigation-release/archive/release/kinetic/ecl_mobile_robot/0.60.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "21d17646874359efbc1296e7961917e8"
SRC_URI[sha256sum] = "740992c6f2ec18390b8dd42b269049a9ae156534291a6708e435821a1ffcf200"
S = "${WORKDIR}/ecl_navigation-release-release-kinetic-ecl_mobile_robot-0.60.3-0"

inherit catkin
