# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Navigation launch and config files for Summit XL robot."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native gmapping navigation"
SRC_URI = "https://github.com/RobotnikAutomation/summit_xl_common-release/archive/release/kinetic/summit_xl_navigation/1.1.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "464cc1d609be8e4465da5ea7d35b0409"
SRC_URI[sha256sum] = "f2471767b088d4663cee59249914f219f062c760ade542e97ad3bec4b439eb6a"
S = "${WORKDIR}/summit_xl_common-release-release-kinetic-summit_xl_navigation-1.1.2-0"

inherit catkin
