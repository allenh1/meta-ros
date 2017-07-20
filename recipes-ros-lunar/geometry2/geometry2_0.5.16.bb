# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A metapackage to bring in the default packages second generation Transform Libra"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin tf2 tf2-bullet tf2-eigen tf2-geometry-msgs tf2-kdl tf2-msgs tf2-py tf2-ros tf2-sensor-msgs tf2-tools"
SRC_URI = "https://github.com/ros-gbp/geometry2-release/archive/release/lunar/geometry2/0.5.16-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e75d7fdeb600e16ec644300a409cfa96"
SRC_URI[sha256sum] = "f340d8acca0e10bf20155b6de8ce2066b372619d4226e86d07d7622f43ed1195"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
