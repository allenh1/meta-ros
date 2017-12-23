# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Description of the Kobuki model.       Provides the model description of Kobuki "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native urdf xacro"
SRC_URI = "https://github.com/yujinrobot-release/kobuki-release/archive/release/kinetic/kobuki_description/0.7.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "10c5811e959a3f1f82550070cdadcdf0"
SRC_URI[sha256sum] = "b8794d68e4dfc2024413e573839d5b5f411801a5a535a22ddbccd779494b49ab"
S = "${WORKDIR}/kobuki-release-release-kinetic-kobuki_description-0.7.4-0"

inherit catkin
