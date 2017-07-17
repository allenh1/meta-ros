# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_plot provides a GUI plugin visualizing numeric values in a 2D plot using dif"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin python-matplotlib python-numpy python-rospkg python_qt_binding qt_gui_py_common qwt_dependency rosgraph rostopic rqt_gui rqt_gui_py rqt_py_common std_msgs"
SRC_URI = "https://github.com/ros-gbp/rqt_plot-release/archive/release/lunar/rqt_plot/0.4.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ef27f8be29aaeedecc97550783d761b0"
SRC_URI[sha256sum] = "ccf117e06d080f1f11bcd66bdfab0f4a7763d92160352d5473509bb0c090016e"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
