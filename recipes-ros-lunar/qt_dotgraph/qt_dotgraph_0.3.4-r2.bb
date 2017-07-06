# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=8;endline=8;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin python-pydot python_qt_binding"
SRC_URI = "https://github.com/ros-gbp/qt_gui_core-release/archive/release/lunar/qt_dotgraph/0.3.4-2.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d7cf5c677a138f4c1858bafca4fe296f"
SRC_URI[sha256sum] = "634be9b006d01be86afe04a937c021191de7a6bfe05df05a65ac580ef75f4c4a"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
