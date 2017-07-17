# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provides wrappers around the yaml-cpp library for various utility functions
    "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=;endline=;md5="

DEPENDS = "boost catkin pkg-config yaml-cpp"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/lunar/swri_yaml_util/0.3.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "183a762056db545f269f37fc4da7df0c"
SRC_URI[sha256sum] = "c65cbd443e83574a87d7291dcbddeb410610bc79e9a8153508618ae904e8e1ad"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
