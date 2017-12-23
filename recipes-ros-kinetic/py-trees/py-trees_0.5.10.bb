# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Pythonic implementation of behaviour trees."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native python-enum34 python-pydot python-setuptools"
SRC_URI = "https://github.com/stonier/py_trees-release/archive/release/kinetic/py_trees/0.5.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c9bb4704103532a046cdc36c2456219b"
SRC_URI[sha256sum] = "e2c92e60b9491be5a94ed683c09b95c4b862e99ddb1007af8bbd613fcba29750"
S = "${WORKDIR}/py_trees-release-release-kinetic-py_trees-0.5.10-0"

inherit catkin
