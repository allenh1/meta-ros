# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The summit_xl_localization package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geographic-msgs geometry-msgs mavros-msgs message-filters message-runtime nav-msgs robot-localization robotnik-msgs roscpp sensor-msgs std-msgs std-srvs tf tf2 tf2-geometry-msgs tf2-ros"
SRC_URI = "https://github.com/RobotnikAutomation/summit_xl_common-release/archive/release/kinetic/summit_xl_localization/1.1.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5b055bef3dee7359e66c4b292152da6c"
SRC_URI[sha256sum] = "dfcaf521b442fb5fa19b58084891074b930cf09041e3d894337904f169b4c818"
S = "${WORKDIR}/summit_xl_common-release-release-kinetic-summit_xl_localization-1.1.2-0"

inherit catkin
