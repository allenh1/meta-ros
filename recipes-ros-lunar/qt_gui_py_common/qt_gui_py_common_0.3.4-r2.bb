# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=8;endline=8;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin python-rospkg python_qt_binding"
SRC_URI = "https://github.com/ros-gbp/qt_gui_core-release/archive/release/lunar/qt_gui_py_common/0.3.4-2.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5c96cb4e7855ead281649f5c8d47af52"
SRC_URI[sha256sum] = "690db34b093385843588deb9d36da6e97f99d6b9deec31cb1d492936af322336"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
