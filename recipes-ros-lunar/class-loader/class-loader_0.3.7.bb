# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The class_loader package is a ROS-independent package for loading plugins during"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin-native cmake-modules console-bridge libpoco-dev"
SRC_URI = "https://github.com/ros-gbp/class_loader-release/archive/release/lunar/class_loader/0.3.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8a7c0e7a8a1e74d8385f7a994aaa164c"
SRC_URI[sha256sum] = "34be4f8b38e2ebdea9456b96f16d9a491423f0ddf30eca91f7c9b5fcffde0a09"
S = "${WORKDIR}/class_loader-release-release-lunar-class_loader-0.3.7-0"

inherit catkin
