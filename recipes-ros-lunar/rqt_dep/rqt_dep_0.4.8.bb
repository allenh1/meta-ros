# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=8;endline=8;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin python-rospkg python_qt_binding qt_dotgraph qt_gui qt_gui_py_common rqt_graph rqt_gui_py"
SRC_URI = "https://github.com/ros-gbp/rqt_dep-release/archive/release/lunar/rqt_dep/0.4.8-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f5b84293722c69c28c52983baf83968f"
SRC_URI[sha256sum] = "ec3227b0dc67dac62e83da5ea4c81792aecaf421e8cece88ce59e3bac9d4da73"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
