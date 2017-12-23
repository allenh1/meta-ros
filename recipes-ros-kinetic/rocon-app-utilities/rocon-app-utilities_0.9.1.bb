# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The rocon_app_utilities package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native python-catkin-pkg-native python-rospkg rocon-console rocon-python-utils rocon-uri roslaunch roslint"
SRC_URI = "https://github.com/yujinrobot-release/rocon_app_platform-release/archive/release/kinetic/rocon_app_utilities/0.9.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "96689f11d221a78b480831e969a58954"
SRC_URI[sha256sum] = "d34fe2fbdd0aa77992a803495a43563145315c2d7e0ad1ac3229d2c194f5dd5d"
S = "${WORKDIR}/rocon_app_platform-release-release-kinetic-rocon_app_utilities-0.9.1-0"

inherit catkin
