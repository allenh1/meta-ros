# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains a script to generate calibration launch and configurationf"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "calibration-launch catkin-native catkin"
SRC_URI = "https://github.com/ros-gbp/calibration-release/archive/release/lunar/calibration_setup_helper/0.10.14-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a448334622d5c40d62062c1bdc69eab6"
SRC_URI[sha256sum] = "29f4738a56635b90f6c99ed62c705c4dc7cd03886e7aa693f7ccca60f3b9df1d"
S = "${WORKDIR}/calibration-release-release-lunar-calibration_setup_helper-0.10.14-0"

inherit catkin
