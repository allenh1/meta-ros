# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Contains scripts that are useful as prefix commands for nodes     started by ros"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native python-psutil"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/lunar/swri_prefix_tools/1.2.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "76e6062f1f1ccdfe8a95d1f9cc9d0345"
SRC_URI[sha256sum] = "a00d34c5c41d06722359600aac08623860636cfc412819550b429dbd5c28d15e"
S = "${WORKDIR}/marti_common-release-release-lunar-swri_prefix_tools-1.2.0-0"

inherit catkin
