# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=9;endline=9;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin python-psutil python_qt_binding rospy rqt_gui rqt_gui_py"
SRC_URI = "https://github.com/ros-gbp/rqt_top-release/archive/release/lunar/rqt_top/0.4.8-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b576e3026e61080a9be283e9a7479e2f"
SRC_URI[sha256sum] = "174e6c9957adbebb06ea473dde5f3c9aa4b830d5653d4fc7e91af67be42f1253"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
